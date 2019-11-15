import React from 'react';

class Beatle extends React.Component {

    constructor(){
        super()
        this.state = {valor : 0}

    }

    remove(e){
        this.setState({valor : 1});
    }

    votar(){
        this.props.onVote(this.props.id);
    }

    render() {
        return (
            <div className="container">

                <input type='checkbox'/>
                 {this.props.name}
                <a onClick={this.remove.bind(this)}>(x)</a>
                <button  className="btn btn-primary" onClick={this.votar.bind(this)} >Votar</button>
                <div className="form-group mx-sm-3 mb-2">
                    <input className="form-control" type="text" value={this.props.votes}/>
                </div>
            </div>)
    }
}


export default Beatle
