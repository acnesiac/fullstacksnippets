import React from 'react';
import {connect} from 'react-redux';
import {Route, Switch} from 'react-router-dom';
import Register from '../components/Register';

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

                <Switch>
                    <Route exact path="/" component={Register}/>
                </Switch>
            </div>
        );
    }
}
export default connect(mapStateToProps, mapDispatchToProps)(App);
