import React, { Component } from 'react';

class lotto extends Component {
    constructor(props) {
        super(props)
        this.state = { lottoAuto: [], lottoInput: [], count: 0 };

        this.handleClick = this.handleClick.bind(this);
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleRadioChange = this.handleRadioChange.bind(this);
    }

    handleClick() {
        if (this.state.count < 6) {
            const newNumber = Math.floor(Math.random() * 45 + 1);
            for (var i = 0; i < this.state.count; i++) {
                console.log(this.state.lottoAuto[i], newNumber);
                if (this.state.lottoAuto[i] === newNumber) {
                    return this.state.count - 1
                }
            }
            this.setState({ lottoAuto: [...this.state.lottoAuto, newNumber], count: this.state.count + 1 });
        }
        if (this.state.count === 6) {
            alert('로또 번호(자동) : ' + this.state.lottoAuto.join(', '));
        }
    }

    handleChange(event) {
        this.setState({ lottoInput: event.target.value });
    }

    handleSubmit(event) {
        alert('로또 번호(수동) : ' + this.state.lottoInput);
        event.preventDefault();
    }

    render() {
        return (
            <div>
                <h2>[LOTTO]</h2>
                <form>
                    <label>
                        자동
                        <input
                            type='radio'
                            name='draw'
                            value='1'
                            checked={this.state.drawType === '1'}
                            onChange={this.handleRadioChange}
                        />
                    </label>
                    <label>
                        수동
                        <input
                            type='radio'
                            name='draw'
                            value='2'
                            checked={this.state.drawType === '2'}
                            onChange={this.handleRadioChange}
                        />
                    </label>
                </form>

                {this.state.drawType === '1' && (
                    <div>
                        <p>NUMBER : {this.state.lottoAuto.join(', ')}</p>
                        <button onClick={this.handleClick}>자동</button>
                    </div>
                )}

                {this.state.drawType === '2' && (
                    <form onSubmit={this.handleSubmit}>
                        <br></br>
                        <label>
                            NUMBER :
                            <input type="text" value={this.state.lottoInput} onChange={this.handleChange} />
                        </label>
                        <p>
                            <input type="submit" value="수동" />
                        </p>
                    </form>
                )}
            </div>
        );
    }
}

export default lotto;