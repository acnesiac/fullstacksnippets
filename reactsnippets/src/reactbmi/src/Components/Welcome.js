/**
 * Created by cliente on 22/04/2017.
 */
import React , {Component} from 'react';
class Welcome extends Component{
    constructor(){
        super();
        //this.props.name = 'hello world';
    }
    sum (a,b){
        return a+b;
    }
    render(){
        return <h1>Hello, </h1>;
    }
}

export default Welcome;
