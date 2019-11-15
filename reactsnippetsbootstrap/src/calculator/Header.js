import React, {Component } from 'react';
class Header extends Component {
  render() {
    return (
        <header id="header" >

      <div className="container">
          <div className="row">
            <div className="col-md-10">
              <h1>Dashboard<small>Manage your site</small></h1>
            </div>
            <div className="col-md-2">
              <div className="dropdown create">
                        
                  <ul className="dropdown-menu">
                          <li><a href="">Add Page</a></li>
                          <li><a href="">Add Post</a></li>
                          <li><a href="">Add User</a></li>
                  </ul>
              </div>
            </div>
          </div>
        </div>
          </header>

    );
  }
}
export default Header;
