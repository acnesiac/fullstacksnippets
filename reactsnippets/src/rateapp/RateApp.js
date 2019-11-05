import React from 'react';
import Beatle from "./Beatle";
class RateApp extends React.Component {
state = {
members : []
};
componentDidMount(){
this.setState({members : [
{id : 1, name : "lenon", votes : 0},
{id : 2, name : "macartney", votes : 0}
] });
}
handleEvent = memberId => {
const updatedList = this.state.members.map(member => {
if (member.id === memberId) {
return Object.assign({}, member, {
votes: member.votes + 1
});
} else {
return member;
}
});
this.setState({
members: updatedList
});
};
render() {
return (
<div className="row">
   {
   this.state.members.map(member =>
   <Beatle
      nameme={member.name}  votes ={member.votes} id={member.id}
      onVote={this.handleEvent}
      />
   )}
</div>
)
}
}
export default RateApp
