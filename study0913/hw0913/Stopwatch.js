import React, {useState, useEffect} from "react";

function Stopwatch() {
    const [start, setStart] = useState(null);
    const [elapsedTime, setElapsedTime] = useState(0);
    const [ongoing, setOngoing] = useState(true);

    useEffect(() => {
        let interval;
        if(ongoing) {
            setStart(performance.now()- elapsedTime);

            interval = setInterval(() =>
                {setElapsedTime(performance.now() - start);
            }, 1000)
        } else {
            clearInterval(interval);
        }

        return () => {
            clearInterval(interval);
        };
    }, [ongoing])

    const handleStart = () => {
        if (!ongoing) {
            setStart(performance.now() - elapsedTime);
        }
        setOngoing(true);
    }

    const handlePause = () => {
        setOngoing(false);
    }

    const handleReset = () => {
        setOngoing(false);
        setElapsedTime(0);

    }
    
    return (
        <div>
            <p>{Math.floor(elapsedTime / 1000)} 초</p>
            <button onClick={handleStart}>시작</button>
            <button onClick={handlePause}>일시정지</button>
            <button onClick={handleReset}>리셋</button>
        </div>
    );
}

export default Stopwatch;