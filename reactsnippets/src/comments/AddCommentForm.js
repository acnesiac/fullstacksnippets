/*
  Add comment Form
  <AddCommentForm />
*/
// Semi-Dumb
import React from 'react'

class AddCommentForm extends React.Component {

    constructor(props) {
        super(props);


        this.processComment = this.processComment.bind(this);

    }

    processComment(event) {
        event.preventDefault();
        console.log(this);
        // 1. Take data from  form
        var commentData = {
            commentName: 'hola',
            commentBody: '123'
        }

        // 2. Pass data back to App
        this.props.addComment(commentData);

        // 3. Reset the form
        this.refs.commentForm.reset();

    }

    render() {
        return (
            <div className="container">
                <h4 className="leave-comment">Add a Comment</h4>
                <form className="post-edit" ref="commentForm" onSubmit={this.processComment}>
                    <div className="form-group">
                        <input className="form-control" type="text" ref="name" placeholder="Your Name" required/>
                    </div>
                    <div>
                        <textarea className="form-control" ref="desc" placeholder="Add your comment here" required/>

                    </div>
                    <div><br/></div>
                    <button id="submit" type="submit" className="btn btn-primary">Add Comment</button>
                </form>
            </div>
        )
    }
}

export default AddCommentForm
