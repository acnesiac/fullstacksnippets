import React from "react";
import { Bar } from "react-chartjs-2";
import axios from "axios";

export default class PersonList extends React.Component {
  state = {
    persons: []
  };

  componentDidMount() {
    axios
      .get(
        `https://whuyp2bk01.execute-api.us-east-1.amazonaws.com/stageone/messages`,
        {
          headers: {
            "Access-Control-Allow-Origin": "*",
            "Access-Control-Allow-Headers":
              "Content-Type,X-Amz-Date,Authorization,X-Api-Key,X-Amz-Security-Token"
          }
        }
      )
      .then(res => {
        const persons = res.data;
        this.setState({ persons });
      });
  }

  render() {
    {
      /*
const data = {
  labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
  datasets: [
    {
      label: 'dataset',
      backgroundColor: 'rgba(255,99,132,0.2)',
      borderColor: 'rgba(255,99,132,1)',
      borderWidth: 1,
      hoverBackgroundColor: 'rgba(255,99,132,0.4)',
      hoverBorderColor: 'rgba(255,99,132,1)',
      data: [165, 59, 80, 81, 56, 55, 40]
    }
  ]
};
*/
    }
    return (
      <ul>
        {this.state.persons.map(person => (
          <li>
            <div>
              <h2>{person.name}</h2>
              <Bar
                data={{
                  labels: [
                    person.name,
                    "February",
                    "March",
                    "April",
                    "May",
                    "June",
                    "July"
                  ],
                  datasets: [
                    {
                      label: "dataset",
                      backgroundColor: "rgba(255,99,132,0.2)",
                      borderColor: "rgba(255,99,132,1)",
                      borderWidth: 1,
                      hoverBackgroundColor: "rgba(255,99,132,0.4)",
                      hoverBorderColor: "rgba(255,99,132,1)",
                      data: [person.name.length, 59, 80, 81, 56, 55, 40]
                    }
                  ]
                }}
                width={100}
                height={50}
                options={{
                  maintainAspectRatio: false
                }}
              />
            </div>
          </li>
        ))}
      </ul>
    );
  }
}
