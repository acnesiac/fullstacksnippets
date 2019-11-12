import React, {Component} from 'react';

class Header extends Component {
    static defaultProps = {
        name: 0, max: 0
    }

    constructor() {
        super();
        this.state = {
            name: "hola",
            projects: [
                {title: "Web development", category: "web"},
                {title: "Architectute", category: "Arch"}
            ]
        }

    }

    onClick(event) {
        this.setState({name: "hellome"});
        console.log(this.state);
    }

    render() {
        return (
            <header id="header" className="App-header">
                <div className="container">
                    <div className="row">
                        <div className="col-md-10">
                            <h2>  Tool </h2>
                        </div>

                    </div>
                </div>
            </header>);
    }
}

export default Header;
