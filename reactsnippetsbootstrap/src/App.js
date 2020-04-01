import React, { Component } from 'react';
import BootstrapBeautyForm from "./forms/BootstrapBeautyForm";
import BootstrapBeautyFooter from "./forms/BootstrapBeautyFooter";
import OffCanvas from "./forms/OffCanvas";
import DashBoard from "./forms/DashBoard";
import ShoppingList from "./reacttutorial/ShoppingList";
import Toggle from "./test/Toggle";
import Beatle from "./rateapp/Beatle";
import RateApp from "./rateapp/RateApp";
import EmpleadoApp from "./empleado/EmpleadoApp";


class App extends Component {
  constructor(){
    super();
  }
  componentDidMount(){
  }
  render() {
    return (
      <div className="container">
          <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
              <div className="container">
                  <a className="navbar-brand" href="#">Container</a>
                  <button className="navbar-toggler" type="button" data-toggle="collapse"
                          data-target="#navbarsExample07" aria-controls="navbarsExample07" aria-expanded="false"
                          aria-label="Toggle navigation">
                      <span className="navbar-toggler-icon"></span>
                  </button>
                  <div className="collapse navbar-collapse" id="navbarsExample07">
                      <ul className="navbar-nav mr-auto">
                          <li className="nav-item active">
                              <a className="nav-link" href="#">Home <span className="sr-only">(current)</span></a>
                          </li>
                      </ul>
                      <form className="form-inline my-2 my-md-0">
                          <input className="form-control" type="text" placeholder="Search" aria-label="Search"/>
                      </form>
                  </div>
              </div>
          </nav>

          <RateApp/>
          <OffCanvas/>
            <EmpleadoApp></EmpleadoApp>
          {/*<BootstrapBeautyFooter/>
          <BootstrapBeautyForm/>
          <DashBoard/>
          <ShoppingList name = "Hola mundo"/>
          <Square/>
          <Toggle/>*/}
       </div>
    );
  }
}
export default App;
