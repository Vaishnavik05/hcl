import React, { useEffect, useState } from 'react'

export default function Timer() {
    const [seconds, setSeconds] = React.useState(0);

    useEffect(() => {
        const interval=setInterval(() => {
            setSeconds(seconds => seconds + 1);
        }, 1000);
        return () => clearInterval(interval);
    },[]);
    return (
        <>
            <div>{seconds}seconds</div>
        </>
    )
}
