import React, { Component } from 'react';

class lotto extends Component {
    constructor(props) {
        super(props)
        this.state = { lottoAuto: [], lottoInput: [], count: 0 };

        this.handleClick = this.handleClick.bind(this);
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleClick() {
        if(this.state.count < 6) {
            const newNumber = Math.floor(Math.random() * 45 + 1);
            // if(number in this.state.lotto !== newNumber) {
                this.setState({ lottoAuto: [...this.state.lottoAuto, newNumber], count: this.state.count + 1 });
            // } else {
            //     this.setState({ lotto: [...this.state.lotto], count: this.state.count - 1 });
            // }
        }
        if (this.state.count === 6) {
            alert('로또 번호(자동) : ' + this.state.lottoAuto.join(', '));
        }
    }

    handleChange(event) {
        this.setState({lottoInput: event.target.value});
    }

    handleSubmit(event) {
        alert('로또 번호(수동) : ' + this.state.lottoInput);
        event.preventDefault();
    }

    render() {
        return (
            <div>
                <h2>[LOTTO]</h2>
                <p>
                    NUMBER :{this.state.lottoAuto.join(', ')}
                </p>
                <button onClick={this.handleClick}>
                    자동
                </button>

                <form onSubmit={this.handleSubmit}>
                    <br></br>
                    <label>NUMBER : 
                        <input type = "text" value={this.state.lottoInput} onChange={this.handleChange} />
                    </label>
                    <p>
                        <input type = "submit" value="수동" />
                    </p>
                </form>
            </div>
        );
    }
}

export default lotto;