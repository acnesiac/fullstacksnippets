require('normalize.css/normalize.css');
require('styles/App.css');

import React from 'react';
import Clock from './Clock';
import Header from './Header';
import LeftPanel from './LeftPanel';
import Form from './Form';
import NavBar from './NavBar';
import Section from './Section';


let yeomanImage = require('../images/yeoman.png');

class AppComponent extends React.Component {
  render() {
    return (
      <div className="index">
        <NavBar/>
        <Header/>
        <Section/>
      </div>
    );
  }
}

AppComponent.defaultProps = {
};

export default AppComponent;
