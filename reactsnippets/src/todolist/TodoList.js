import React from 'react';
import TodoStore from './TodoStore';
import TodoItem from './TodoItem';

class TodoList extends React.Component {

    constructor(props) {
        super(props);
        this.state = {collection: []};
    }

    componentWillMount() {
        TodoStore.emitter.on('change', function (items) {
            this.setState({collection: items});
        }.bind(this));
    }

    render() {
        return (
            <ul>
                <li>TODO</li>
                {
                    this.state.collection.filter(function (x) {
                        return x.completed == false
                    }).map(function (item) {
                        return (<TodoItem key={item.id} title={item.title} id={item.id} completed={item.completed}/>);
                    }, this)
                }
                <li>DONE</li>
                {
                    this.state.collection.filter(function (x) {
                        return x.completed == true
                    }).map(function (item) {
                        return (<TodoItem key={item.id} title={item.title} id={item.id} completed={item.completed}/>);
                    }, this)
                }
            </ul>
        );
    }
}

export default TodoList;
