/**
 * Created by cliente on 23/04/2017.
 */
import React,{Component} from 'react';
class BarChart extends Component{
    constructor(props){
        super(props);
        this.state = {data : props.data}
    }
    render(){
        return <div>Barchart</div>;
    }
}
export default BarChart;

