import React, {Component} from 'react';

class FormSimple extends React.Component {
    constructor(){
        super()

    }

    render() {
        return (
            <div className="container">

                <input type='checkbox'/>
                {this.props.name}

            </div>)
    }
}
export default FormSimple
