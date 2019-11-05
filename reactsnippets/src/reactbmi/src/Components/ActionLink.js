/**
 * Created by cliente on 22/04/2017.
 */
import React, {Component} from 'react';
class ActiveLink extends Component{
    constructor(){
        super();
        this.handleClick = this.handleClick.bind(this);
        this.state = {isToggleOn : true};

    }

    handleClick(e) {
        e.preventDefault();
        console.log('The link was clicked.');
        this.setState(prevState => ({
            isToggleOn: !prevState.isToggleOn
        }));
    }

    render(){
        return <div>Click me in active link<a href="#" onClick={this.handleClick}>Click here         {this.state.isToggleOn ? 'ON' : 'OFF'}
        </a></div>;
    }
}
export default ActiveLink;
