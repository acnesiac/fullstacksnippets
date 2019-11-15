/**
 * Created by cliente on 23/04/2017.
 */
import React,{Component} from 'react';
class Toggle extends Component{

    constructor(props){
        super(props);
    }

    handler(){
        console.log('toogling');
    }

    render(){
        return <div>
            Toogle
            <button onClick={this.handler}>Toogle me</button>
            </div>
    }

}
export default Toggle;