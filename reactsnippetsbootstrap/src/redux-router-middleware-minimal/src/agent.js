import superagentPromise from 'superagent-promise';
import _superagent from 'superagent';

const superagent = superagentPromise(_superagent, global.Promise);
const API_ROOT = 'http://www.imagenesrx.com.mx/api';
const responseBody = res => res.body;
let token = null;
const tokenPlugin = req => {
  if (token) {
    req.set('authorization', `Token ${token}`);
  }
}
const requests = {
  del: url =>
    superagent.del(`${API_ROOT}${url}`).use(tokenPlugin).then(responseBody),
  get: url =>
    superagent.get(`${API_ROOT}${url}`).use(tokenPlugin).then(responseBody),
  put: (url, body) =>
    superagent.put(`${API_ROOT}${url}`, body).use(tokenPlugin).then(responseBody),
  post: (url, body) =>
    superagent.post(`${API_ROOT}${url}`, body).use(tokenPlugin).then(responseBody)
};

const Auth = {
  register: (username, email, password) =>
    requests.post('/users', { user: { username, email, password } })
};
const omitSlug = article => Object.assign({}, article, { slug: undefined })
const Articles = {
  del: slug =>
    requests.del(`/articles/${slug}`),

  get: slug =>
    requests.get(`/articles/${slug}`),

  update: article =>
    requests.put(`/articles/${article.slug}`, { article: omitSlug(article) }),
  create: article =>
    requests.post('/articles', { article })
};
export default {
  Articles,
  Auth,
  setToken: _token => { token = _token; }
};
