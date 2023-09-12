import React, { Component } from 'react';

class LottoManual extends Component {
    constructor(props) {
        super(props);
        this.state = {lotto : []};

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({lotto: event.target.value});
    }

    handleSubmit(event) {
        alert('로또 번호(수동) : ' + this.state.lotto);
        event.preventDefault();
    }

    render() {
        return(
            <form onSubmit={this.handleSubmit}>
                <br></br>
                <label>NUMBER : 
                    <input type = "text" value={this.state.lotto} onChange={this.handleChange} />
                </label>
                <p>
                    <input type = "submit" value="수동" />
                </p>
            </form>
        );
    }
}

export default LottoManual;