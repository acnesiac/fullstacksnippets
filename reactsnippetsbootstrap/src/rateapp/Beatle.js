import React from 'react';

class Beatle extends React.Component {
    constructor() {
        super();
        this.state = {valor: 0};
    }

    remove(e) {
        this.setState({valor: 1});
    }

    votar() {
        this.props.onVote(this.props.id);
    }

    render() {
        return (
            <div className="container">

                <div className="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                    <div className="d-flex justify-content-between align-items-center w-100">
                        <strong className="text-gray-dark">{this.props.id}</strong>
                        <strong className="text-gray-dark">Full Name</strong>
                        <a onClick={this.remove.bind(this)}>{this.props.name}</a>
                        <button className="btn btn-warning" onClick={this.votar.bind(this)}>Votar</button>
                        <div className="form-group mx-sm-3 mb-2">
                            <input className="form-control" type="text" value={this.props.votes}/>
                        </div>
                    </div>
                    <span className="d-block">@name {this.props.name}</span>
                </div>
            </div>)
    }
}

export default Beatle
