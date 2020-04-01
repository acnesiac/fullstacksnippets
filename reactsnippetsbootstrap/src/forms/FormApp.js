import React, {Component} from 'react';
import FormSimple from "./FormSimple";

class FormApp extends React.Component {
    state = {
        members: []
    };

    constructor() {
        super();
    }

    componentDidMount() {
        console.log("componentDidMount")
        this.setState({
            members: [
                {name: "lenon", votes: 0},
                {name: "george", votes: 0},
                {name: "ringo", votes: 0},
                {name: "paul", votes: 0}

            ]
        })
    }

    componentWillMount() {
        console.log("componentWillMount")

    }

    render() {
        return (
            <div>
                {this.state.members.map(member =>
                    <FormSimple name={member.name}/>
                )}
            </div>);
    }
}

export default FormApp
