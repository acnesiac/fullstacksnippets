import React from 'react';
import SignIn from './sign-in/SignIn';
import SignInSide from './sign-in-side/SignInSide';
import SignUp from './sign-up/SignUp';
import StickyFooter from './sticky-footer/StickyFooter';

function App() {
  return (
  <div>
    <SignIn/>
	<SignInSide/>
	<SignUp/>
	<StickyFooter/>
	</div>
  );
}

export default App;
