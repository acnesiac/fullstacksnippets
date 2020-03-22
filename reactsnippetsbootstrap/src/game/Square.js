import React, {Component} from 'react';

class Square extends Component {
    constructor(props) {
        super(props);
        this.state = {
            value: null,
        };
    }

    render() {
        return (
            <div>
                <button className="square" onClick={() => this.setState({value: 'X'})}>
                    click {this.state.value}
                </button>
                <input value={this.state.value}></input>
            </div>
        );
    }
}

export default Square;
