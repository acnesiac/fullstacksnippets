import React, { Component } from 'react';
import BootstrapBeautyForm from "./forms/BootstrapBeautyForm";
import BootstrapBeautyFooter from "./forms/BootstrapBeautyFooter";
import OffCanvas from "./forms/OffCanvas";
import DashBoard from "./forms/DashBoard";
import ShoppingList from "./reacttutorial/ShoppingList";
import Square from "./game/Square";
import Toggle from "./test/Toggle";
import Beatle from "./rateapp/Beatle";
import RateApp from "./rateapp/RateApp";

class App extends Component {
  constructor(){
    super();
  }
  componentDidMount(){
  }
  render() {
    return (
      <div className="App">
          <OffCanvas/>
          <RateApp/>
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
