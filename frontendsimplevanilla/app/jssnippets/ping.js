$(document).ready( function() {
  var interval = 1
  var ping = setInterval( function() {
    $.ajax({
      url: './ping.txt',
      dataType: 'text',
      success: function (data) {
        console.log(data);
        $('#ping').append( data )
      }
    })
    }, 1
  )
})
