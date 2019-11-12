import React from 'react';
import {render} from 'react-dom';

import TodoList from './TodoList';
import InputBox from './InputBox';

class TodoApp extends React.Component {
    render() {
        return (
            <div className="container">
                <InputBox/>
                <TodoList/>
            </div>)
    }
}


export default TodoApp
