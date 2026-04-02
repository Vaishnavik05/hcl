import React from 'react'

export default function ProtectedRoute({children}) {
    const isAuthenticated = true;
    if (!isAuthenticated) {
        return <h1>Unauthorized Access.</h1>;
    }
    else{
        return children;
    }
}
