/**
 * Created by cliente on 22/04/2017.
 */
import React, {Component} from 'react';
class MailBox extends Component{
    constructor(props){
        super(props);
        this.state ={
            value : props.value
        }
    }
    render(){
        return <div>Mailbox {this.props.value}</div>
    }
}
export default MailBox;