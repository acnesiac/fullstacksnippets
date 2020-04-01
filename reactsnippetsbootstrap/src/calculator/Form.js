import React, {Component} from 'react';
import {FormGroup, ControlLabel, FormControl, HelpBlock} from 'react-bootstrap';

class Form extends Component {


    render() {
        return (
            <form>
                <FormGroup
                    controlId="formBasicText"

                >
                    <ControlLabel>Working example with validation</ControlLabel>
                    <FormControl
                        type="text"
                        placeholder="Enter text"
                    />
                </FormGroup>
            </form>
        );
    }
}

export default Form;
