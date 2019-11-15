import React from 'react';
import TodoStore from './TodoStore';

class InputBox extends React.Component {

  constructor() {
    super();
    this.state = {value: ''};
  }

  _setState(e) {
    this.setState({value: e.target.value});
  }

  _add(e) {
    if(e.keyCode == 13){
      TodoStore.add(this.state.value);
      this.setState({value: ''});
    }
  }

  render() {
    return (
      <input type="text" value={this.state.value} onKeyUp={this._add.bind(this)} onChange={this._setState.bind(this)}
             placeholder="Type Something..." />
    );
  }
}

export default InputBox;
