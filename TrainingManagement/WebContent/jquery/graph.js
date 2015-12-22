
    window.onload = function () {
        var chart = new CanvasJS.Chart("bottomDashboard",
        {
            title: {
                text: "Productivity by Day"             
            },
            animationEnabled: true,
            axisX:{      
              valueFormatString: "DDD",
              labelAngle: -40
            },
            
            legend: {
                verticalAlign: "bottom",
                horizontalAlign: "center"
            },
          toolTip: {
            content: function(e){
              var weekday =["Sun","Mon", "Tue", "Wed", "Thu","Fri","Sat"];
              var  str1 = weekday[e.entries[0].dataPoint.x.getDay()] + "<br/>  <span style =' color:" + e.entries[0].dataSeries.color + "';>" +  e.entries[0].dataSeries.name + "</span>: <strong>"+ e.entries[0].dataPoint.y + " hrs</strong> <br/>" ; 
              return str1
            }
          },

            data: [
              {  
                name: "very distracting",
                showInLegend: true,
                legendMarkerType: "square",
                type: "stackedArea",
                color :"rgba(211,19,14,.8)",
                markerSize: 0,

                dataPoints: [
                {x: new Date(2013, 02 , 17) , y: 2.4  },
                {x: new Date(2013, 02 , 18) , y: .6  },
                {x: new Date(2013, 02 , 19) , y: .8  },
                {x: new Date(2013, 02 , 20) , y: 1.6  },
                {x: new Date(2013, 02 , 21) , y: 1.4  },
                {x: new Date(2013, 02 , 22) , y: 1.4  },
                {x: new Date(2013, 02 , 23) , y: 2.6  }

                ]
            },
              {        
                name: "distracting",
                showInLegend: true,
                legendMarkerType: "square",
                type: "stackedArea",
                markerSize: 0,
              color :"rgba(95,53,87,.8)",

                dataPoints: [
                {x: new Date(2013, 02 , 17) , y: 3.3  },
                {x: new Date(2013, 02 , 18) , y: 1.6  },
                {x: new Date(2013, 02 , 19) , y: 2.1  },
                {x: new Date(2013, 02 , 20) , y: 1.6  },
                {x: new Date(2013, 02 , 21) , y: 1.4  },
                {x: new Date(2013, 02 , 22) , y: 1.7  },
                {x: new Date(2013, 02 , 23) , y: 4.6  }

                ]
            },
            
            {  
                name: "productive",
                showInLegend: true,
                legendMarkerType: "square",
                type: "stackedArea",
                markerSize: 0,
              color: "rgba(60,84,151,.9)",

                dataPoints: [
                {x: new Date(2013, 02 , 17) , y: 2.4  },
                {x: new Date(2013, 02 , 18) , y:  2 },
                {x: new Date(2013, 02 , 19) , y: 2.8  },
                {x: new Date(2013, 02 , 20) , y: 1.6  },
                {x: new Date(2013, 02 , 21) , y: 1.4  },
                {x: new Date(2013, 02 , 22) , y: 1.4  },
                {x: new Date(2013, 02 , 23) , y: 1.6  }

                ]
            },
            {  
                name: "very productive",
                showInLegend: true,
                legendMarkerType: "square",
                type: "stackedArea",
                markerSize: 0,
              color: "rgba(22,115,211,.9)",

                dataPoints: [
                {x: new Date(2013, 02 , 17) , y: .4  },
                {x: new Date(2013, 02 , 18) , y: 7 },
                {x: new Date(2013, 02 , 19) , y: 6.8  },
                {x: new Date(2013, 02 , 20) , y: 4.6  },
                {x: new Date(2013, 02 , 21) , y: 6.4  },
                {x: new Date(2013, 02 , 22) , y: 7.4  },
                {x: new Date(2013, 02 , 23) , y: 1.6  }

                ]
            }
            ]
          ,
          legend: {
            cursor:"pointer",
            itemclick : function(e){
              if (typeof(e.dataSeries.visible) === "undefined" || e.dataSeries.visible){
                e.dataSeries.visible = false;
              }
              else{
                e.dataSeries.visible = true;
              }
            	chart.render();
            }
          }
        });

chart.render();
}
