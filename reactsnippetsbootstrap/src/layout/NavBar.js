import React, {Component} from 'react';

class NavBar extends Component {
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


    onSetSidebarOpen(open) {
        this.props.onSetSidebarOpen(open);
    }

    render() {
        return (
            <nav className="navbar navbar-inverse navbar-fixed-top ">
                <div className="container">
                    <div className="navbar-header">
                        <button type="button" className="navbar-toggle collapsed"
                                data-toggle="collapse" data-target="#navbar"
                                aria-expanded="false" aria-controls="navbar"
                                onClick={this.onClick.bind(this)}
                        >
                            <span className="sr-only">Toggle navigation</span>
                            <span className="icon-bar"></span>
                            <span className="icon-bar"></span>
                            <span className="icon-bar"></span>
                        </button>
                        <a className="navbar-brand" href="#">Snippets</a>
                    </div>
                    <div id="navbar" className="collapse navbar-collapse">
                        <ul className="nav navbar-nav">
                            <li className="active" ><a href="/" onClick={this.onClick.bind(this)}>CommentsApp</a></li>
                            <li ><a href="/todoapp">Todoapp</a></li>
                            <li><a href="/empleado">Empleado</a></li>
                            <li><a href="/calculadora">Calculadora</a></li>
                            <li><a href="/">Home</a></li>
                            <li><a href="/rateapp">RateApp</a></li>
                            <li><a href="/formapp">FormApp</a></li>
                            <li><a href="/bar">Bar</a></li>
                            <li><a href="/clock">Clock</a></li>
                            <li><a href="/theme">BootstrapSnippets</a></li>
                            <li>
                                <a  href="#" className="navbar-brand" onClick={() => this.onSetSidebarOpen(true)}>
                                    Open sidebar
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>);
    }
}

export default NavBar;
