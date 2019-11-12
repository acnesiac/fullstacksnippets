/**
 * Created by cliente on 22/04/2017.
 */
import React, {Component} from 'react';
class Greeting extends Component{
    constructor(){
        super();
    }
    render(){
        return <div>Hola {this.props.greeting}</div>
    }
}
export default Greeting;