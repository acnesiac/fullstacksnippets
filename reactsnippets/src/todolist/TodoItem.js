import React from 'react';
import TodoStore from './TodoStore';

class TodoItem extends React.Component {
  _updateItem(e) {
    TodoStore.update(this.props.id, e.target.checked);
  }

  _removeItem(e) {
    e.preventDefault();
    TodoStore.remove(this.props.id);
  }

  render() {
    return (
      <li>
        <input type="checkbox" onChange={this._updateItem.bind(this)} checked={this.props.completed} />
        &nbsp;
        <span>{this.props.title}</span>
        &nbsp;
        <span><a href="#" onClick={this._removeItem.bind(this)}>(x)</a></span>
      </li>
    );
  }
}

export default TodoItem;
