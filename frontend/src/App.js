import React, {Component} from 'react';

export default class App extends Component {
  constructor() {
    super();

    this.state = {
      data: null
    };
  }

  fetchData = () => {
    fetch('/api/hehe', {
      headers: {
        'Accept': 'application/json'
      }
    })
      .then(data => data.json())
      .then((res) => {
        this.setState(() => ({
          data: res
        }));
      })
  };

  render() {
    const data = this.state.data ? this.state.data.map((row, i) => {
      return (
        <tr key={row.id}>
          <td>{row.name}</td>
        </tr>
      );
    }) : null;

    return (
      <div>
        <table>
          <tbody>
            {data}
          </tbody>
        </table>
        <button onClick={this.fetchData}>Fetch</button>
      </div>
    );
  }
}
