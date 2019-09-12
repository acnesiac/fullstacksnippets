import React, { Component } from 'react';
class App extends Component {

  constructor(){
    super();
    this.state = {
      id : '',
      desc : '',
      accounts : []
    };
  }

  componentDidMount(){
    this.fetchAccounts();
  }

  fetchAccounts(){
    fetch('http://localhost:8888/account')
    .then(res => res.json())
    .then(data => {
      this.setState({accounts : data});
    });
  }

  render() {
    return (
      <div>
        <table>
          <tbody>
            {
              this.state.accounts.map(
                  account => {
                    return (
                      <tr>
                        {account.id}
                      </tr>
                    )
                  }
                )
            }
          </tbody>
        </table>
      </div>
    )
  }
}

export default App;
