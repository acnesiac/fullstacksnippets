import React from 'react';
import Beatle from "./Beatle";

class RateApp extends React.Component {
    constructor() {
        super();
        this.state = {
            members: []
        };
    }

    componentDidMount() {
        this.setState({
            members: [
                {id: 1, name: "lenon", votes: 0},
                {id: 2, name: "Ringo", votes: 0},
                {id: 3, name: "Paul", votes: 0},
                {id: 4, name: "Mcartney", votes: 0}
            ]
        });
    }

    handleEvent = memberId => {
        const updatedList = this.state.members.map(member => {
            if (member.id === memberId) {
                return Object.assign({}, member, {
                    votes: member.votes + 1
                });
            } else {
                return member;
            }
        });
        this.setState({
            members: updatedList
        });
    };

    render() {
        return (
            <main role="main" className="container">
                <div className="my-3 p-3 bg-white rounded shadow-sm">
                    <h6 className="border-bottom border-gray pb-2 mb-0">Suggestions</h6>
                    {
                        this.state.members.map(member =>
                            <Beatle
                                name={member.name} votes={member.votes} id={member.id}
                                onVote={this.handleEvent}
                            />
                        )}
                </div>
            </main>
        )
    }
}

export default RateApp
