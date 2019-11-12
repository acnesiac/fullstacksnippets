/**
 * Created by cliente on 22/04/2017.
 */
import React, {Component} from 'react';
class Clock extends Component{
    constructor(){
        super();
        this.state = {date:new Date()};
    }
    //lifecycle hooks
    componentDidMount(){

    }
    componentWillUnMount(){

    }
    render(){
        return <h1>Inside Clock {this.state.date.toLocaleTimeString()}</h1>;
    }
}
export default Clock;