Imports Fhi.Fw.Domain

Namespace Model.Specification
    ''' <summary>
    ''' 出発日
    ''' </summary>
    ''' <remarks></remarks>
    Public Class DepartureDate : Inherits PrimitiveValueObject(Of DateTime)

        Public Sub New(year As Integer, month As Integer, day As Integer)
            Me.New(New DateTime(year, month, day))
        End Sub

        Public Sub New(value As Date)
            MyBase.New(value)
        End Sub

    End Class
End Namespace