import * as React from 'react';
import Menu from './Menu';

export default ({location, children}) => (
  <div>
    <Menu name={location.pathname} />
    <div className='container-fluid'>
      <div className='container xd-container'>

        {children}

        <div className='container'>
          <div className='row'>
            <div className='chomeol-12 text-center'></div>
          </div>
        </div>
      </div>
    </div>
  </div>
);
