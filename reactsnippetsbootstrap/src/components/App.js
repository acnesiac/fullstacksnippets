import Header from './Header';
import React from 'react';
import {connect} from 'react-redux';
import {Route, Switch} from 'react-router-dom';
import Home from '../components/Home';
import Cars from "../containers/Cars";
import AppGraph from "./AppGraph";

const mapStateToProps = state => {
    return {
        appName: state.common.appName,
        currentUser: state.common.currentUser,
    }
};

const mapDispatchToProps = dispatch => ({
    onLoad: (payload, token) => {
    }
});

class App extends React.Component {
    constructor() {
        super();
    }


    componentWillReceiveProps(nextProps) {
    }

    componentWillMount() {
    }

    render() {
        return (
            <div>
                <Header
                    appName={this.props.appName}
                    currentUser={this.props.currentUser}/>
                <Switch>
                    <Route exact path="/" component={AppGraph}/>
                </Switch>

            </div>
        );

    }
}


export default connect(mapStateToProps, mapDispatchToProps)(App);
