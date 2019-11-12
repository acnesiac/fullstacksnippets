import React, {Component} from 'react';
import AxiosList from '../axios/AxiosList';

class MainContainer extends Component {
    render() {
        return (<section id="main">
            <div className="container">
                <div clasName="row">
                    <div className="col-md-3">
                        <div className="list-group">
                            <a className="list-group-item active" href="# ">Pages</a>
                        </div>
                        <div className="well"></div>
                    </div>
                    <div className="col-md-9">
                        <div className="panel panel-default">
                            <div className="panel-heading">
                                <h3> Website Overview </h3>
                            </div>
                            <div className="panel-body">
                                <div className="col-md-3">
                                    <div classNane="well">
                                        <h2> Users </h2>
                                        <h3> 203</h3>
                                    </div>
                                </div>
                                <div classNane="col-md-3">
                                    <div classNane="well">
                                        <h2> Users </h2>
                                        <h3> 203</h3>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div classNane="panel panel-default">
                            <div classNane="panel-heading">
                                <h3>Users</h3>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </section>);
    }
}

export default MainContainer;
