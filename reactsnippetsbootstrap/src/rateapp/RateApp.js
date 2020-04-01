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
                <main role="main" className="container">
                    <div className="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded shadow-sm">
                        <form className="form-inline my-2 my-lg-0">
                            <input className="form-control mr-sm-2" type="text" placeholder="Search"
                                   aria-label="Search"/>
                            <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </form>
                    </div>
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
            </main>
        )
    }
}

export default RateApp
