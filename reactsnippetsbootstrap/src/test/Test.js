import React, {Component} from 'react';

class Test extends React.Component {

    constructor(props){
        super(props);
        this.state = {
            value:props.value
        }
    }

    onChange(event){
        //console.log(event.target.value);

        this.setState({value:event.target.value});
    }

    render() {
        return <div>
                    <h1>Hello, {this.props.name}</h1>
                    <input
                        type="range"
                        value={this.state.value}
                        min={this.props.min}
                        max={this.props.max}
                        step={this.props.step}
                        onChange={this.onChange.bind(this)}
                    />
                    <input  type='text' value={this.state.value}/>
                </div>
    }
}
export default Test
