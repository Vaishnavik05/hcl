import React from 'react'

export default function Footer({ theme = 'light' }) {
    return <>
        <footer style={{ backgroundColor: theme === 'light' ? 'white' : 'black', color: theme === 'light' ? 'black' : 'white' }}>
            <p>Copyright 2024</p>
        </footer>
    </>
}
