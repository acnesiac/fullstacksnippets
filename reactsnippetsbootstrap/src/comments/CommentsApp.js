import React from 'react'
import AddCommentForm from './AddCommentForm'
import NewComment from './NewComment'
import '../App.css';
import Sidebar from "react-sidebar";

class CommentsApp extends React.Component {


    onSetSidebarOpen(open) {
        this.setState({ sidebarOpen: open });
    }
    constructor(props) {
        super(props);

        this.state = {
            comments: [],
            sidebarOpen: true
        };

        this.addComment = this.addComment.bind(this);
        this.onSetSidebarOpen = this.onSetSidebarOpen.bind(this);

    }

    getInitialState() {
        return {
            comments: []
        }
    }

    addComment(commentData) {

        (foo, bar, ...args) => {

        }

        var timeStamp = (new Date()).getTime();
        console.log(this.state);
        this.state.comments['comment-id' + timeStamp] = commentData;
        this.setState({
            comments: this.state.comments
        });
    }

    renderComment(comment) {
        return (
            <li className="">
                {comment.commentName}
            </li>
        )
    }

    render() {
        console.log(this.state)
        return (
            <div className="row">
                <Sidebar
                    sidebar={<b>Sidebar content</b>}
                    open={this.state.sidebarOpen}
                    onSetOpen={this.onSetSidebarOpen}

                    styles={{ sidebar: { background: "black" } }}
                >
                    <button type="submit" className="btn btn-primary" onClick={() => this.onSetSidebarOpen(true)}>
                        Open sidebar
                    </button>
                </Sidebar>
                <ol className="comment-list block-comments">
                    {
                        this.state.comments.map(  (comment) => {
                            <li className="">
                                {comment.commentName}
                            </li>
                        })
                    }
                </ol>

                <AddCommentForm addComment={this.addComment}/>


            </div>
        )
    }
}


export default CommentsApp
