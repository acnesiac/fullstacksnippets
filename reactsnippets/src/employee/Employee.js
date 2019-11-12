import React, {Component} from 'react';

class Employee extends Component {

  state = {
      members : [1,2,3,4,5]
  };
  
  constructor(){
      super();

  }
    callme() {
        console.log('consoleloging : ' + this.state.members);
    }
    render() {
        return (
            <div>
                <a href="#" className="btn btn-info" role="button" onClick={this.callme.bind(this)}>Link Button</a>
                <button type="button" className="btn btn-info" onClick={() => console.log('hola')}>Button</button>
                <input type="button" className="btn btn-info" value="Input Button"/>
            </div>);
    }
}

export default Employee;
