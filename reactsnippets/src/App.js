import React, { Component } from 'react';
import BootstrapBeautyForm from "./forms/BootstrapBeautyForm";
import BootstrapBeautyFooter from "./forms/BootstrapBeautyFooter";
import OffCanvas from "./forms/OffCanvas";
import DashBoard from "./forms/DashBoard";
import ShoppingList from "./reacttutorial/ShoppingList";
import Square from "./game/Square";
import Toggle from "./test/Toggle";

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
          <BootstrapBeautyFooter/>
          <BootstrapBeautyForm/>
          <DashBoard/>
          <ShoppingList name = "Hola mundo"/>
          <Square/>
          <Toggle/>
       </div>
    );
  }
}
export default App;
