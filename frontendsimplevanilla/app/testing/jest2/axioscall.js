import axios from "axios";
import axios from 'axios';

export default axios.create({
  baseURL: `http://jsonplaceholder.typicode.com/`
});
export default async call2 => {
  const response = await axios.get("http://jsonplaceholder.typicode.com/todos/1", {
    params: {

    }
  });

  return response.data.results;
};

