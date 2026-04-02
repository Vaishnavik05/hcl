import React from 'react'

export default function Greet({ name="User", show, children }) {
  return (
    <>
        Hello, {name}!
        {show && children}
    </>
  )
}
