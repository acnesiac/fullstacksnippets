import React, { Component } from 'react';

class Menu extends Component {
    render () {
        const element = (
            <h1>
                hello formatName();

            </h1>

        );

        let options = this.props.options

        return (
            <ul>
                {options.map(option => <li>{option}</li>)}
            </ul>
        )
    }
}

export default Menu;
