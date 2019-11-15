
import React, { Component } from 'react';
import './App.css';
import Range from './Components/Range';
import Output from './Components/Output';
import Menu from './Components/Menu';
import Welcome from './Components/Welcome';
import Clock from './Components/Clock';
import ActionLink from './Components/ActionLink';
import MyComponent from './Components/MyComponent';
import LoginControl from './Components/LoginControl';
import Greeting from './Components/Greeting';
import MailBox from './Components/MailBox';
import Header from './Header/Header';
import TextBox from './TextBox/TextBox';
import BarChart from './Components/BarChart';
import Toggle from './Components/Toggle';
import Projects from './ProjectManager/Projects';

import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom';
import Calculator from './Components/Calculator';
class App extends Component {
  render() {
       const About = () => (
          <div>
            <h2>About</h2>
            <div className="App">
                <Clock></Clock>
                <Welcome></Welcome>
                <ActionLink/>
                <MyComponent/>
                <LoginControl/>
                <Greeting greeting={'hola nombre'}/>
                <MailBox value={'sending props'}/>
                <BarChart/>
                <Toggle/>
                </div>
          </div>
        )
      return (
          <Router>
            <div className="jumbotron">
              <ul>
                <li><Link to="/">Home</Link></li>
                <li><Link to="/about">Acerca de</Link></li>
                <li><Link to="/project">Project</Link></li>

              </ul>

              <hr/>

              <Route exact path="/" component={Calculator}/>
              <Route path="/about" component={About}/>
              <Route path="/project" component={Projects}/>

            </div>
          </Router>
    );
  }
}
export default App;
