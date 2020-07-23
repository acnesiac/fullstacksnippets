import React, {Component} from 'react';
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
    constructor() {
        super();
    }

    componentDidMount() {
    }

    render() {
        return (
            <div className="container">
                <RateApp/>
            </div>
        );
    }
}

export default App;
