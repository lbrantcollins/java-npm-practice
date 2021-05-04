import { Component, Fragment, React } from 'react';
import axios from 'axios';

class Data extends Component {

    state = {
        value: ''
    };

    handleChangeText = (e) => {
        this.setState({ value: e.target.value });
    }

    handleClickButton = (e) => {
        e.preventDefault();

        const document = {
            label: this.state.value
        };

        axios.post('http://localhost:8080/api/v1/create', document)
        .then(response => { 
            console.log(response) 
        });
    }

    render() {
        return (
            <Fragment>
                <div>Data Component</div>

                <form>
                    <label>
                        Value:
                        <input
                            type="text"
                            onChange={this.handleChangeText}
                            value={this.state.value} />
                    </label>
                    <input
                        type="submit"
                        onClick={this.handleClickButton}
                        value="Button" />
                </form>
            </Fragment>
        );
    }
}

export default Data;